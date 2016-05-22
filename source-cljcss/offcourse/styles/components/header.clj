(ns offcourse.styles.components.header
  (:require [garden.units :as u :refer [vh]] 
            [offcourse.styles.vocabulary :as v]))

(defn header [{:keys [templates colors units]}]
  [[v/header (merge (:row-component templates)
                     (:highlighted templates)
                     {:justify-content :center
                      :align-items :center
                      :flex 1
                      :height (vh 100)
                      :padding (:full units)})]
   [v/header--list (merge (:column-component templates)
                          {:align-items :flex-start})]
   [v/header--sublist (merge (:row-component templates)
                             {:align-items :flex-start})]
   [v/header--textbar (merge (:textbar templates)
                             {:font-size (:header-font units)
                              :line-height (:header-line-height units)
                              :margin-right (:third units)
                              :margin-bottom (:third units)})]
   [v/header--textbar-small (merge (:textbar templates)
                             {:font-size (:subheader-font units)
                              :line-height (:subheader-line-height units)
                              :margin-bottom (:third units)})]
   [v/header--textbar-inverse (merge (:paper templates))]])