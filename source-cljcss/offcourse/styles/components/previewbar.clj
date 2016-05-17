(ns offcourse.styles.components.previewbar
  (:require [garden.units :as u :refer [vh]] 
            [offcourse.styles.vocabulary :as v]))

(defn previewbar [{:keys [templates colors units]}]
  [[v/previewbar (merge (:row-component templates)
                     (:smudged-paper templates)
                     {:justify-content :space-between
                      :align-items :center
                      :flex 1
                      :padding (:two units)})]
   [v/previewbar--button (merge (:textbar templates)
                                {:font-size (:header-font units)
                                 :line-height (:header-line-height units)
                                 :margin-right (:sixth units)
                                 :margin-bottom (:third units)})]])

