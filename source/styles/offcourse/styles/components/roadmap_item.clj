(ns offcourse.styles.components.roadmap-item
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :refer [percent]]
             [arithmetic :refer [* +]]
             [stylesheet :refer [at-media]]]
            [offcourse.styles.vocabulary :as v]))

(defn roadmap-item [{:keys [templates breakpoints colors units]}]
  [[v/roadmap-item      (merge (:row-component           templates)
                               (:sheet                   templates))
    [v/hovered                 (:border-highlighted      templates)]]
   [v/roadmap-item--meta       {:width                  (* (:atom units) 140)}]
   [v/roadmap-item--assignee   {:width                  (* (:atom units) 140)}]
   [v/roadmap-item--milestone  {:width                  (* (:atom units) 140)}]
   [v/roadmap-item--activity   {:width                  (* (:atom units) 140)}]
   [v/roadmap-item--body       {:width                  (* (:atom units) 140)}]
   ])