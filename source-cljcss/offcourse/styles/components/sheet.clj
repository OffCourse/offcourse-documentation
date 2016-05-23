(ns offcourse.styles.components.sheet
  (:refer-clojure :exclude [rem + - * /])
  (:require [garden.arithmetic :refer [* /]]
            [garden.units :as u :refer [percent px rem]]
            [offcourse.styles.vocabulary :as v]))

(defn sheet [{:keys [templates borders colors fonts units]}]
  [[v/sheets (merge (:column-component templates)
                   {:padding (:full units)
                    :display :block
                    :flex             1
                    :background-color (:light colors)})]
   [v/sheet (merge (:row-component templates)
                   (:sheet templates)
                   {:flex 1
                    :justify-content  :center
                    :align-items      :flex-start
                    :padding (:full units)})
    [v/hovered (:highlighted borders)]
    [v/content (:text templates)
     [v/title (merge (:title templates)
                 {:padding 0
                  :padding-bottom (:two-third units)})]]
    [v/content-emphasis
     [:p (merge (:title templates)
                {:padding-bottom (:full units)})
      [v/last (merge (:text templates)
              {:padding-bottom 0
               :margin 0})]]]]])


