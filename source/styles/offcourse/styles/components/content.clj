(ns offcourse.styles.components.content
  (:refer-clojure :exclude [first last + - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [units :as u :refer [vh percent]]]
            [offcourse.styles.vocabulary :as v]))

(defn content [{:keys [templates colors units fonts]}]
  [[v/content   
    [:h1               (merge  (:title              templates)
                               {:padding-bottom    (:two-third units)})]
    [:h2                       (:subtitle           templates)]
    [:p                (merge  (:text               templates)
                               {:padding-bottom    (:two-third units)})
     [v/last                   {:padding-bottom     0}]]]])