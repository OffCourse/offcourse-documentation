(ns offcourse.styles.components.button
  (:require [offcourse.styles.vocabulary :as v]))

(defn button [{:keys [templates colors units fonts]}]
  [[v/button                (merge  (:buttonbase            templates))]
   [v/button-card           (merge  (:paper                 templates)
                                    (:row-component         templates)
                                    (:subtitle              templates)
                                    (:border-default        templates)
                                    {:padding            [[(:third units) (:half units)]]
                                     :margin             [[ 0 (:sixth units) (:full units) 0]]})
    [v/hovered              (merge  (:border-highlighted    templates))]]
  ])