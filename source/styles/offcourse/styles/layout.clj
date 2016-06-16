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
                             {:justify-content :center
                              :padding-bottom (:two units)})
    [v/first {:padding-bottom 0} ]]
   [v/grid (merge (:row-component templates)
                  {:width (:max-content-width units)})]
   [v/grid--section (merge (:column-component templates)
                           {:padding (:full units)
                            :flex 1})
    [v/last (merge {:flex 3})]]
   [v/container (merge (:row-component templates))]])