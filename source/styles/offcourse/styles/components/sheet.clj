(ns offcourse.styles.components.sheet
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :refer [percent]]
             [arithmetic :refer [* +]]
             [stylesheet :refer [at-media]]]
            [offcourse.styles.vocabulary :as v]))

; Disliking this abstraction!
(defn sheet [{:keys [templates breakpoints colors units]}]
  [[v/sheet                   (merge (:column-component        templates)
                                     (:sheet                   templates)
                                     {:padding                (:full units)
                                      :transition            [[:margin-top "1s" :ease-in-out]]})
    [v/hovered                       (:border-highlighted      templates)]]
   
   [v/sheet-collapsable 
    [v/sheet--section   
      [v/last                 (merge {:overflow                :hidden
                                      :transition            [[:max-height "0.5s" :ease-in-out]]
                                      :max-height              0})]]
    [v/hovered
     [v/sheet--section               {:max-height             (* (:full units) 10)
                                      :transition            [[:max-height "0.5s" :ease-in-out "0.5s"]]}]]]
   [v/sheet--title            (merge (:title                   templates))]
   [v/sheet--text             (merge (:text                    templates))]])