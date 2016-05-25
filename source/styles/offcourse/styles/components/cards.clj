(ns offcourse.styles.components.cards
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :refer [percent]]
             [arithmetic :refer [* +]]
             [stylesheet :refer [at-media]]]
            [offcourse.styles.vocabulary :as v]))

(defn calculate-breakpoint [{:keys [min-width max-width column-count]} {:keys [column-gap column]}]
  (at-media {:min-width min-width :max-width max-width}
            (let [gap-count    (dec column-count)
                  actual-width (+ (* column-count column) (* gap-count column-gap))]
              [v/cards {:display      (if (= column-count 0) :none :block)
                        :column-count column-count}])))

(defn calculate-breakpoint-person [{:keys [min-width max-width column-count]} {:keys [column-gap column]}]
  (at-media {:min-width min-width :max-width max-width}
            (let [gap-count   (dec (dec column-count))
                  actual-width (+ (* (dec column-count) column) (* gap-count column-gap))]
              [v/cards-person {:display      (if (= column-count 0) :none :block)
                               :column-count (dec column-count)}])))

(defn cards [{:keys [templates breakpoints borders colors units]}]
  [[v/cards (merge (:row-component templates)
                   (:recycled-paper templates)
                   {:padding          (:full units)
                    :column-gap       (:column-gap units)})
    [v/container {:display :block}]]

   (for [breakpoint breakpoints] (calculate-breakpoint breakpoint units))

   [v/card (merge (:column-component templates)
                  (:sheet templates)
                  {:align-items      :stretch
                   :padding [[0 (:full units)]]
                   :flex 1})
    [v/hovered (:highlighted borders)]

    [v/card--section (merge (:component templates)
                            {:padding [[0 0 (:full units) 0]]})
     [v/first {:padding-top    (:two-third units)
               :padding-bottom (:two-third units)}]
     [v/last {}]]
    [v/content (merge (:text templates))]]

   ; Personal cards

   [v/cards-person (merge (:row-component templates)
                   (:recycled-paper templates)
                   {:padding          (:full units)
                    :column-gap       (:column-gap units)})
    [v/container {:display :block
                  :width (percent 100)}]]

   (for [breakpoint breakpoints] (calculate-breakpoint-person breakpoint units))

   [v/card-person (merge (:row-component templates)
                         (:sheet templates)
                         {:padding [[0]]})
    [v/hovered (:highlighted borders)]
    [v/card--section (merge (:column-component templates)
                            {:padding [[0 (:full units) 0]]})
     [v/first {:padding-left    0
               :padding-right   0}]
     [v/last {:padding [[(:half units)(:half units)(:third units)(:two-third units)]]}]
     [v/card-person--image {:height (* (:atom units) 140) 
                            :filter "grayscale(100%)"}]]
    [v/button-container (merge (:row-component templates))]
    [v/content (merge (:text templates)
                      {:margin-bottom (:third units)})]]])
