(ns offcourse.styles.components.header
  (:refer-clojure :exclude [first last])
  (:require [garden.units :as u :refer [vh percent]]
            [offcourse.styles.vocabulary :as v]))

(defn header [{:keys [templates colors units]}]
  [[v/header--container (:row-component templates)
                        (:highlighted templates)
                        {:justify-content :center
                         :width (percent 100)}]
   [v/header (merge (:row-component templates)
                    {:justify-content :center
                     :align-items :center
                     :flex [[0 1 (:max-content-width units)]]
                     :padding [[(:four units)(:full units)]]})]
   [v/header--section (merge (:row-component templates)
                             {:flex 1})]
   [v/header--section (merge (:row-component templates)
                             {:flex 1})
    [v/last {:flex 3
             :padding-left (:full units)}]] 
   [v/header--list (merge (:column-component templates)
                          {:align-items :flex-start})]
   [v/header--sublist (merge (:row-component templates)
                             {:align-items :flex-start})]
   [v/header--textbar (merge (:textbar templates)
                             {:font-size (:header-font units)
                              :line-height (:header-line-height units)
                              :margin-right (:third units)
                              :padding [[ 0 (:full units)]]
                              :margin-bottom (:third units)})]
   [v/header--textbar-small (merge (:textbar templates)
                             {:font-size (:subheader-font units)
                              :line-height (:subheader-line-height units)
                              :margin-bottom (:third units)})]
   [v/header--textbar-inverse (merge (:paper templates))]])