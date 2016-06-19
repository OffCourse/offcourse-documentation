(ns offcourse.styles.components.content
  (:refer-clojure :exclude [first last + - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [units :as u :refer [vh percent]]]
            [offcourse.styles.vocabulary :as v]))

; Child element selectors unavoidable due to markdown parsing
(defn content [{:keys [templates colors units fonts]}]
  [[v/content   
    [:h1               (merge  (:title              templates)
                               {:padding-bottom    (:two-third units)})]
    [:h2               (merge  (:subtitle           templates)
                               {:padding-bottom    (:two-third units)})]
    [:p                (merge  (:text               templates)
                               {:padding-bottom    (:two-third units)})
     [v/last                   {:padding-bottom     0}]]]])