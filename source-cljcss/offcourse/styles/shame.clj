(ns offcourse.styles.shame
  (:refer-clojure :exclude [+ - * /])
  (:require [garden
             [units :as u :refer [percent px]]
             [stylesheet :refer [at-media]]
             [arithmetic :refer [/ + *]]
             [selectors :as s]]))

; Shame file to style the mailchimp form - o horror - with ID's
; Nice exercise to get a feel for this garden CSS
(defn shame [{:keys [templates breakpoints colors units fonts]}]
  [[:#mce-EMAIL {:background :red
                 :width (* (:full units) 10)}]
   [:#mce-EMAIL-LABEL (merge {:background :red}
                             (:banner templates))]])

