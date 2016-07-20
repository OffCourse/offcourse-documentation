(ns offcourse.styles.shame
  (:refer-clojure :exclude [rem + - * /])
  (:require [offcourse.styles.vocabulary :as v]
            [garden
             [units :as u :refer [rem percent px]]
             [stylesheet :refer [at-media]]
             [arithmetic :refer [/ + *]]
             [selectors :as s]]))

(defn shame [{:keys [templates breakpoints colors units fonts]}]
  [[v/code        (merge (:recycled-paper    templates)
                         (:mono              templates)
                         {:padding        [[(:half units) (:full units)]]})]
   [v/code-pre    (merge {:white-space       :pre-wrap})]])