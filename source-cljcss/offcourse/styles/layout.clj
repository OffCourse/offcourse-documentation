(ns offcourse.styles.layout
  (:require [garden.units :as u :refer [percent vh px]]
            [offcourse.styles.vocabulary :as v]))

(defn layout [{:keys [templates units colors]}]
  [[v/layout        (merge (:column-component templates)
                           (:paper templates)
                           {:flex 1})
    [v/layout--section (merge (:row-component templates)
                              {:flex 1})]]
   [v/main (merge (:row-component templates)
                  (:recycled-paper templates)
                  {:flex 1})]
   [v/main--section (merge {:flex 1})
    [v/last (merge (:column-component templates)
                   (:recycled-paper templates)
                   {:flex 3})]]
   [v/container (merge (:row-component templates)
                       {:padding [[0 0 (:two-third units) 0]]})]])
