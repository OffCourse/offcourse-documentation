(ns offcourse.styles.components.header
  (:refer-clojure :exclude [first last])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [units :as u :refer [vh percent]]]
            [offcourse.styles.vocabulary :as v]))

(defn header [{:keys [templates colors units]}]
  [[v/header (merge (:highlighted templates))
    [v/header--container (merge {:padding [[(:four units) 0 (:four units) (* (:atom units) 35)]]})]]
   [v/header--list (merge (:column-component templates)
                          {:align-items :flex-start})]
   [v/header--sublist (merge (:row-component templates)
                             {:align-items :flex-start})]
   [v/header--textbar (merge (:textbar templates)
                             {:font-size (:header-font units)
                              :line-height (:header-line-height units)
                              :margin-right (:third units)
                              :padding [[ 0 (:full units) 0 (:full units)]]
                              :margin-bottom (:third units)})]
   [v/header--textbar-small (merge (:textbar templates)
                             {:font-size (:subheader-font units)
                              :line-height (:subheader-line-height units)
                              :margin-bottom (:third units)})]
   [v/header--textbar-inverse (merge (:paper templates))]])