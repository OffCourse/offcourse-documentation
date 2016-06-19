(ns offcourse.styles.components.card
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :refer [percent]]
             [arithmetic :refer [* +]]
             [stylesheet :refer [at-media]]]
            [offcourse.styles.vocabulary :as v]))

(defn card [{:keys [templates breakpoints borders colors units]}]
  [[v/card              (merge (:column-component        templates)
                               (:sheet                   templates)
                               {:padding                (:full units)})
    [v/hovered                 (:highlighted             borders)]]
   [v/card--business    (merge (:row-component           templates)
                               {:padding                 0})
    [v/card--section           {:width                  (* (:atom units) 140)}
     [v/last                   {:width                   :auto
                                :padding              [[(:half units)(:half units)(:third units)(:two-third units)]]}]]]])