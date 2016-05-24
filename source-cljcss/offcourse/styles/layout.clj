(ns offcourse.styles.layout
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [units :as u :refer [percent vh px]]]
            [offcourse.styles.vocabulary :as v]))

(defn layout [{:keys [templates units colors]}]
  [[v/layout        (merge (:column-component templates)
                           (:paper templates))]
   [v/layout--section (merge (:recycled-paper templates)
                              (:row-component templates)
                              {:justify-content :center})]
   [v/main (merge (:row-component templates)
                  {:width (:max-content-width units)})]
   [v/main--section (merge {:flex 1})
    [v/last (merge (:column-component templates)
                   {:flex 3})]]
   [v/main--header (merge (:textbar templates)
                          {:font-size (:subheader-font units)
                           :padding [[0 (:full units)]]
                           :line-height (:subheader-line-height units)
                           :margin-left (* (:full units) 1)})]
   [v/container (merge (:row-component templates)
                       {:padding [[0 0 (:two-third units) 0]]})]
   [v/container-without (merge (:row-component templates))]])
