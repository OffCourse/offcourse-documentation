(ns offcourse.styles.shame
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :as u :refer [percent px]]
             [stylesheet :refer [at-media]]
             [arithmetic :refer [/ + *]]
             [selectors :as s]]))

(defn shame [{:keys [templates breakpoints colors units fonts]}]
  [:#mce-EMAIL {:background :purple}])