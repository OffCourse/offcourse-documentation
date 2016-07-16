(ns offcourse.styles.components.sheet
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :refer [percent]]
             [arithmetic :refer [* +]]
             [stylesheet :refer [at-media]]]
            [offcourse.styles.vocabulary :as v]))

; Disliking this abstraction!
(defn sheet [{:keys [templates breakpoints colors units]}]
  [[v/sheet             (merge (:column-component        templates)
                               (:sheet                   templates)
                               {:padding                (:full units)
                                :transition            [[:margin-top "1s" :ease-in-out]]
                                })
    [v/hovered                 (:border-highlighted      templates)]]
   [v/sheet--section    (merge (:column-component        templates))]])