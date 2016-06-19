(ns offcourse.styles.components.label
  (:require [offcourse.styles.vocabulary :as v]))

(defn label-component [{:keys [templates fonts colors units]}]
  [[v/label       (merge  (:column-component      templates)
                          (:tiny-font             templates)
                          (:recycled-paper        templates)
                          {:align-items           :center
                           :justify-content       :center
                           :height               (:full units)
                           :margin-bottom        (:sixth units)
                           :margin-right         (:sixth units)
                           :padding            [[(:tenth units) (:half units)]]})
   [v/selected            (:highlighted           templates)]
   [v/hovered             (:selected              templates)]]])
