(ns offcourse.styles.components.block
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :refer [percent]]
             [arithmetic :refer [* +]]
             [stylesheet :refer [at-media]]]
            [offcourse.styles.vocabulary :as v]))

(defn block [{:keys [templates breakpoints borders colors units]}]
  [[v/block         (merge      (:column-component      templates)
                                (:sheet                 templates)
                                {:align-items           :stretch
                                 :padding             [[0 (:full units)]]})
    [v/hovered                  (:highlighted           borders)]]])
