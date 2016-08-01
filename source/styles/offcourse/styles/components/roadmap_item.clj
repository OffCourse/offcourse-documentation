(ns offcourse.styles.components.roadmap-item
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :refer [percent]]
             [arithmetic :refer [* +]]
             [stylesheet :refer [at-media]]]
            [offcourse.styles.vocabulary :as v]))

(defn roadmap-item [{:keys [templates breakpoints colors units]}]
  [[v/roadmap-item                (merge (:column-component        templates)
                                         (:sheet                   templates)
                                         {:padding                (:full units)})
    [v/hovered                           (:border-highlighted      templates)]]
   [v/roadmap-item--header        (merge (:row-component           templates)
                                         {:justify-content         :space-between
                                          :padding               [[0 0 (:full units) 0]]})]
   [v/roadmap-item--issue-number  (merge (:title                   templates)
                                         {:text-align              :right})]
   [v/roadmap-item--meta          (merge (:row-component           templates)
                                         {:padding               [[0 0 (:full units) 0]]
                                          :justify-content         :space-between})]
   [v/roadmap-item--assignee      (merge (:column-component        templates)       
                                         {:width                  (* (:atom units) 140)})]
   [v/roadmap-item--milestone     (merge (:column-component        templates)       
                                         {})]
   [v/roadmap-item--activity      (merge (:column-component        templates)
                                         {})]
   [v/roadmap-item--body          (merge (:row-component           templates)      
                                         {})]
   [v/roadmap-item--title         (merge (:title                   templates))]
   [v/roadmap-item--subtitle      (merge (:subtitle                templates))]
   [v/roadmap-item--text          (merge (:text                    templates))]
   [v/roadmap-item--tiny          (merge (:label                   templates))]
   ])