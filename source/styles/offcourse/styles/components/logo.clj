(ns offcourse.styles.components.logo
  (:refer-clojure :exclude [first last + - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [units :as u :refer [vh percent]]]
            [offcourse.styles.vocabulary :as v]))

(defn logo [{:keys [templates colors units fonts]}]
  [[v/logo        (merge (:textbar templates)
                         {:font-size     (:subheader-font units)
                          :line-height   (:subheader-line-height units)})]
   [v/logo--padded       {:padding       [[0 (:full units)]]}]
   [v/logo--inverse      (:paper templates)]
   [v/logo--large        {:font-size (:header-font units)
                          :line-height (:header-line-height units)
                          :margin-right (:third units)
                          :padding [[ 0 (:full units) 0 (* (:atom units) 25)]]
                          :margin-bottom (:third units)}]])