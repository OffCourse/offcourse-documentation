(ns offcourse.styles.components.footer
  (:refer-clojure :exclude [first last + - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [units :as u :refer [vh percent]]
              [selectors :as s]]
            [offcourse.styles.vocabulary :as v]))

(defn footer [{:keys [templates colors units borders]}]
  [[v/footer              (merge {:background        (:night colors)
                                  :color             (:day colors)})]])

; (defn footer [{:keys [templates colors units borders]}]
;   [[v/footer              (merge (:highlighted        templates)
;                                  {:padding         [[(:two units) 0]]
;                                   :background        (:night colors)
;                                   :color             (:day colors)})
;     [v/footer--container  (merge (:row-component      templates)
;                                  {:align-items        :flex-start})]]
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
;    [v/footer--header      (merge (:title              templates)
;                                  {:padding          [[0 0 (:third units) 0]]
;                                   :color             (:day colors)})]])