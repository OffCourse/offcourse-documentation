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

; Shame file, but somehow interesting to seperate changes from the base code
(defn shame [{:keys [templates breakpoints colors units fonts]}]
  [[:.feature--image {:width "100%"
                      :max-height (rem 20)
                      :filter "grayscale(100%)"}]
   [:.example--image {:width "100%"
                      :filter "grayscale(100%)"
                      :transition [["all" "1s" "ease" "1s"]]}
    [v/hovered {:filter "none"}]]
   (at-media {:min-width (px 768)} 
             [:.sticky {:position :sticky
                        :top (:full units)}])
   ;responsiveness working
   (let [{:keys [min-width max-width percent]} (first breakpoints)]
     (at-media {:min-width min-width :max-width max-width}
               ; [v/header--textbar (merge {:font-size (/ (:header-font units) 2)
                                          ; :line-height (/ (:header-line-height units) 2)})]
               ; [v/header--textbar-small (merge {:display :none})]
               ; [v/header--section (merge {:flex 0})
                 ; [v/last {:padding 0}]]
               [:.main {:flex-direction :column}]
               ; [:.dashboard {:width "100%"
                             ; :padding [[0 (:full units)]]}]
               [:.sheets {:padding (:full units)}]
               [:.layout {:height "unset"}]))])


