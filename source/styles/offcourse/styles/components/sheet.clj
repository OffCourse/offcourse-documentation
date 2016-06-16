(ns offcourse.styles.components.sheet
  (:refer-clojure :exclude [rem + - * /])
  (:require [garden.arithmetic :refer [* /]]
            [garden.units :as u :refer [percent px rem]]
            [offcourse.styles.vocabulary :as v]))

(defn sheet [{:keys [templates borders colors fonts units]}]
  [[v/sheets    (merge (:column-component templates)
                       {:padding           [[(:full units) 0 ]]
                        :display           :block})]

   [v/sheet     (merge (:row-component templates)
                       (:sheet templates)
                       {:flex             1
                        :justify-content  :center
                        :align-items      :flex-start
                        :padding         (:full units)})
    [v/hovered         (:highlighted borders)]

    [v/content
     [v/title   (merge (:title templates)
                       {:padding 0
                        :padding-bottom (:two-third units)})]]
    
    [v/emphasis (merge (:title templates)
                       {:padding-bottom (:full units)})]
    [v/emphasis-textbar (merge (:textbar templates))]
    [v/content
     [:p (merge (:text templates)
                {:padding-bottom 0
                 :margin-bottom 0})]]
    [v/content-padded
     [:p (merge (:text templates)
                {:padding-bottom (:two-third units)
                 :margin-bottom 0})
      [v/last {:padding-bottom 0}]]]]])