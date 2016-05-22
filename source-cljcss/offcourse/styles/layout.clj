(ns offcourse.styles.layout
  (:require [garden.units :as u :refer [percent vh]]
            [offcourse.styles.vocabulary :as v]))

(defn layout [{:keys [templates units colors]}]
  [[v/layout        (merge (:column-component templates)
                           (:paper templates)
                           {:flex 1
                            :align-content    :stretch})
    [v/layout--section (merge (:row-component templates)
                              {:flex 1})]]

   [v/main (merge (:row-component templates)
                  (:recycled-paper templates)
                  {:width (percent 100)
                   :flex 1
                   :flex-wrap :wrap})]
   [v/main--section
    [v/last (merge (:column-component templates)
                   (:recycled-paper templates)
                   {:flex 2})]]
   [v/container (merge (:row-component templates)
                       {:padding [[0 0 (:two-third units) 0]]})]])
