(ns offcourse.styles.components.sheet
  (:refer-clojure :exclude [rem + - * /])
  (:require [garden.arithmetic :refer [* /]]
            [garden.units :as u :refer [percent px rem]]
            [offcourse.styles.vocabulary :as v]))

(defn sheet [{:keys [templates borders colors fonts units]}]
  [[v/sheet             (merge (:row-component templates)
                               (:sheet templates)
                               {:flex             1
                                :justify-content  :center
                                :align-items      :flex-start
                                :padding         (:full units)})
    [v/hovered                 (:highlighted borders)]]])