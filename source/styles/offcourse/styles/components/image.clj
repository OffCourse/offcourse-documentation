(ns offcourse.styles.components.image
  (:refer-clojure :exclude [rem + - * /])
  (:require [garden.arithmetic :refer [* /]]
            [garden.units :as u :refer [percent px rem]]
            [offcourse.styles.vocabulary :as v]))

(defn image [{:keys [templates borders colors fonts units]}]
  [[v/image                   {:display           :block
                               :width             (percent 100)}]
   [v/image--filtered         {:filter            "grayscale(100%)"
                               :transition      [[:all "1s" :ease "1s"]]}]
   [v/image--filtered-hover
    [v/hovered                {:filter            :none}]]]) 