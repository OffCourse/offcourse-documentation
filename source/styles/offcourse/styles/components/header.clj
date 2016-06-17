(ns offcourse.styles.components.header
  (:refer-clojure :exclude [first last + - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [units :as u :refer [vh percent]]]
            [offcourse.styles.vocabulary :as v]))

(defn header [{:keys [templates colors units]}]
  [[v/header                      (merge    (:highlighted         templates))]
   [v/header--column              (merge    (:column-component    templates)
                                            {:align-items         :flex-start})]
   [v/header--row                 (merge    (:row-component       templates)
                                            {:align-items         :flex-start})]])