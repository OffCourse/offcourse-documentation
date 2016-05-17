(ns offcourse.styles.components.header
  (:require [garden.units :as u :refer [vh]] 
            [offcourse.styles.vocabulary :as v]))

(defn header [{:keys [templates colors units]}]
  [[v/header (merge (:row-component templates)
                     (:highlighted templates)
                     {:justify-content :space-between
                      :align-items :center
                      :flex 1
                      :height (vh 100)
                      :padding (:full units)})]
   [v/header--list (merge (:column-component templates)
                          {:align-items :flex-start})]
   [v/header--textbar (merge (:textbar templates)
                             {:font-size (:header-font units)
                              :line-height (:header-line-height units)
                              :margin-right (:sixth units)
                              :margin-bottom (:third units)})]])
