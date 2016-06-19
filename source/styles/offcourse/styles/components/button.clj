(ns offcourse.styles.components.button
  (:require [offcourse.styles.vocabulary :as v]))

(defn button [{:keys [templates colors units fonts]}]
  [v/button-card            (merge (:buttonless         :templates)
                                   {:color              :red})])

;    [v/footer--textbar     (merge (:logo               :templates)
;                                  (:negative           :templates)
;                                  (:component          :templates)
;                                  (:title              templates)
;                                  {:outline            :none
;                                   :flex-direction     :row
;                                   :font-size         (:subtitle-font units)
;                                   :padding         [[(:sixth units) (:half units)]]
;                                   :border-bottom     (:default borders)
;                                   :margin-right      (:sixth units)
;                                   :margin-bottom     (:full units)
;                                   :background        (:day colors)
;                                   :color             (:night colors)
;                                   :cursor             :pointer})
;     [v/hovered                   (:highlighted        borders)]]
