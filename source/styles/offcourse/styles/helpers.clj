(ns offcourse.styles.helpers
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [units :as u :refer [percent vh px]]]
            [offcourse.styles.vocabulary :as v]))

(defn helpers [{:keys [templates breakpoints colors units fonts]}]
  [[v/padding-b-third         {:padding             [[ 0 0 (:third units) 0]]}]
   [v/padding-t-twothird      {:padding             [[(:two-third units) 0 0 0]]}]
   [v/padding-b-twothird      {:padding             [[ 0 0 (:two-third units) 0]]}]
   [v/padding-tb-one          {:padding             [[(:full units) 0]]}]
   [v/padding-t-two           {:padding-top           (:two units)}]
   [v/padding-tb-four         {:padding             [[(:four units) 0]]}]
  ])