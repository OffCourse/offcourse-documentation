(ns offcourse.styles.components.dashboard
  (:require [offcourse.styles.vocabulary :as v]))

(defn dashboard [{:keys [templates colors units]}]
  [v/dashboard (merge (:column-component templates)
                      {:padding [[0 0 0 (:full units)]]})
   [v/container {:padding [[(:full units) 0 (:full units) 0]]}]])
