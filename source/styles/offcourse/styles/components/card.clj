(ns offcourse.styles.components.card
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :refer [percent]]
             [arithmetic :refer [* +]]
             [stylesheet :refer [at-media]]]
            [offcourse.styles.vocabulary :as v]))

(defn card [{:keys [templates breakpoints borders colors units]}]
  [[v/card              (merge (:column-component        templates)
                               (:sheet                   templates)
                               {:padding                (:full units)})
    [v/hovered                 (:highlighted             borders)]]
   [v/card--business    (merge (:row-component           templates)
                               {:padding                 0})
    [v/card--section           {:flex                    1} 
     [v/last                   {:flex                    2
                                :padding              [[(:half units)(:half units)(:third units)(:two-third units)]]}]]]])
    

 ; [[v/cards (merge (:row-component templates)
  ;                  (:recycled-paper templates)
  ;                  {:padding          [[(:full units) 0]]
  ;                   :column-gap       (:column-gap units)})
  ;   [v/container {:display :block}]]

  ;  (for [breakpoint breakpoints] (calculate-breakpoint breakpoint units))

  ;  [v/card (merge (:column-component templates)
  ;                 (:sheet templates)
  ;                 {:align-items      :stretch
  ;                  :padding [[0 (:full units)]]
  ;                  :flex 1})
  ;   [v/hovered (:highlighted borders)]

  ;   [v/card--section (merge (:component templates)
  ;                           {:padding [[0 0 (:full units) 0]]})
  ;    [v/first {:padding-top    (:two-third units)
  ;              :padding-bottom (:two-third units)}]
  ;    [v/last {}]]
  ;   [v/content (merge (:text templates))]]

  ;  ; Personal cards

  ;  [v/cards-person (merge (:row-component templates)
  ;                  (:recycled-paper templates)
  ;                  {:padding          [[(:full units) 0]]
  ;                   :column-gap       (:column-gap units)})
  ;   [v/container {:display :inline-block
  ;                 :width (percent 100)}]]

  ;  (for [breakpoint breakpoints] (calculate-breakpoint-person breakpoint units))

  ;  [v/card-person (merge (:row-component templates)
  ;                        (:sheet templates)
  ;                        {:padding [[0]]})
  ;   [v/hovered (:highlighted borders)]
  ;   [v/card--section (merge (:column-component templates)
  ;                           {:padding [[0 (:full units) 0]]})
  ;    [v/first {:padding-left    0
  ;              :padding-right   0}]
  ;    [v/last {:padding [[(:half units)(:half units)(:third units)(:two-third units)]]}]
  ;    [v/card-person--image {:height (* (:atom units) 140) 
  ;                           :filter "grayscale(100%)"}]]
  ;   [v/button-container (merge (:row-component templates))]
  ;   [v/content (merge (:text templates)
  ;                     {:margin-bottom (:third units)})]]]