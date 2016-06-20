(ns offcourse.styles.components.logo
  (:refer-clojure :exclude [first last + - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [units :as u :refer [vh percent]]]
            [offcourse.styles.vocabulary :as v]))

(defn logo [{:keys [templates colors units fonts]}]
  [[v/logo                     (:textbar             templates)]

   [v/logo-padded              {:padding           [[0 (:full units)]]}]

   [v/logo-inverse             (:paper               templates)]
   
   [v/logo-large        (merge (:banner              templates)
                               {:padding           [[0 (:full units) 0 (* (:atom units) 25)]]
                                :margin            [[0 (:third units) (:third units) 0]]})]])