(ns offcourse.styles.components.card
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :refer [percent]]
             [arithmetic :refer [* +]]
             [stylesheet :refer [at-media]]]
            [offcourse.styles.vocabulary :as v]))

(defn card [{:keys [templates breakpoints borders colors units]}]
  [[v/card          (merge        (:column-component      templates)
                                  (:sheet                 templates)
                                  {:align-items           :stretch
                                   :padding             [[0 (:full units)]]})
    [v/hovered                    (:highlighted           borders)]]])
