(ns offcourse.styles.components.content
  (:refer-clojure :exclude [first last + - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [units :as u :refer [vh percent]]]
            [offcourse.styles.vocabulary :as v]))

(defn content [{:keys [templates colors units fonts]}]
  [[v/content   
     [:p                (merge (:text templates)
                               {:padding-bottom (:two-third units)
                                :margin-bottom 0})
      [v/last                  {:padding-bottom 0}]]]])

    ; [v/content        
    ;  [v/title           (merge (:title templates)
    ;                            {:padding 0
    ;                             :padding-bottom (:two-third units)})]
    
    ;  [v/emphasis        (merge (:title templates)
    ;                            {:padding-bottom (:full units)})]
    
    ;  [:p                (merge (:text templates)
    ;                            {:padding-bottom 0
    ;                             :margin-bottom 0})]]

    ; [v/content-padded
    ;  [:p                (merge (:text templates)
    ;                            {:padding-bottom (:two-third units)
    ;                             :margin-bottom 0})
    ;   [v/last                  {:padding-bottom 0}]]]]
