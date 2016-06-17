(ns offcourse.styles.shame
  (:refer-clojure :exclude [rem + - * /])
  (:require [offcourse.styles.vocabulary :as v]
            [clojure.string :as str]
            [garden
             [units :as u :refer [rem percent px]]
             [stylesheet :refer [at-media]]
             [arithmetic :refer [/ + *]]
             [selectors :as s]
             [util :as util]]))

(defn shame [{:keys [templates breakpoints colors units fonts]}]
   ; unsticky responsive 
   ; (at-media {:min-width (px 768)} 
   ;           [:.sticky {:position :sticky
   ;                      :top (:full units)}])
   ; (let [{:keys [min-width max-width percent]} (first breakpoints)]
     ; (at-media {:min-width min-width :max-width max-width}
               ; [v/header--textbar (merge {:font-size (/ (:header-font units) 2)
                                          ; :line-height (/ (:header-line-height units) 2)})]
               ; [v/header--textbar-small (merge {:display :none})]
               ; [v/header--section (merge {:flex 0})
                 ; [v/last {:padding 0}]]
               ; [:.main {:flex-direction :column}]
               ; [:.dashboard {:width "100%"
                             ; :padding [[0 (:full units)]]}]
               ; [:.layout {:height "unset"}]))]
               )


