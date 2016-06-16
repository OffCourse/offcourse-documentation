(ns offcourse.styles.components.logo
  (:require [offcourse.styles.vocabulary :as v]))

(defn logo [{:keys [templates colors units fonts]}]
  [[v/logo (merge (:textbar templates)
                  {:font-size     (:subheader-font units)
                   :padding       [[0 (:full units)]]
                   :line-height   (:subheader-line-height units)
                   :margin-top    (:two units)
                   :margin-left   (:full units)})]])