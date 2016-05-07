(ns offcourse.styles.shame
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :as u :refer [percent px]]
             [stylesheet :refer [at-media]]
             [arithmetic :refer [/ + *]]
             [selectors :as s]]))

(defn shame [{:keys [templates breakpoints colors units fonts]}]
  [[:#mce-EMAIL {:background :red
                 :width (* (:full units) 10)}]
   [:#mce-EMAIL-LABEL {:background :red
                       :subtitle fonts}]])