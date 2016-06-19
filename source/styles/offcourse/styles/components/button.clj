(ns offcourse.styles.components.button
  (:require [offcourse.styles.vocabulary :as v]))

(defn button [{:keys [templates borders colors units fonts]}]
  [[v/button                (merge  (:buttonless        :templates))]
   [v/button-card           (merge  (:logo               :templates)
                                    (:negative           :templates)
                                    (:component          :templates)
                                    (:title              templates)
                                    {:outline            :none
                                     :flex-direction     :row
                                     :font-size         (:subtitle-font units)
                                     :padding         [[(:sixth units) (:half units)]]
                                     :border-bottom     (:default borders)
                                     :margin-right      (:sixth units)
                                     :margin-bottom     (:full units)
                                     :background        (:day colors)
                                     :color             (:night colors)
                                     :cursor             :pointer})
    [v/hovered              (merge  (:highlighted        borders))]]
  ])