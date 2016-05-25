(ns offcourse.styles.shame
  (:refer-clojure :exclude [+ - * /])
  (:require [offcourse.styles.vocabulary :as v]
            [clojure.string :as str]
            [garden
             [units :as u :refer [percent px]]
             [stylesheet :refer [at-media]]
             [arithmetic :refer [/ + *]]
             [selectors :as s]
             [util :as util]]))

; Shame file, but somehow interesting to seperate changes from the base code
(defn shame [{:keys [templates breakpoints colors units fonts]}]
  [[:#mc_embed_signup {:width (percent 100)}]
   [:#mc_embed_signup_scroll (merge (:column-component templates)
                                    {:width (percent 100)
                                     :align-items :flex-start})]
   [:.mc-field-group (merge (:row-component templates)
                            {:width (percent 100)
                             :flex-wrap :wrap})]
   [:#mce-EMAIL-LABEL (merge (:title templates)
                             {:padding [[0 0 (:full units) 0]]})]
   [:#mce-EMAIL-LABEL-TWO (merge (:text templates)
                                 {:padding-top (:full units)})]
   [:#mce-EMAIL (merge (:subtitle templates))
                       {:flex 2
                        :padding [[(:half units)(:half units)(:half units)(:full units)]]
                        :font-family (:base fonts)
                        :font-size  (:title-font units) 
                        :line-height (:title-line-height units)
                        :font-weight 300
                        :background (:light colors)}]
   [:#mce-submit (merge (:row-component templates)
                    {:flex 1
                     :align-items :stretch})]
   [:#mc-embedded-subscribe (merge (:textbar templates)
                                   {:width (percent 100)
                                    :padding [[(:half units) 0]]
                                    :justify-content :center
                                    :align-items :center
                                    :background (:primary colors)
                                    :font-family (:base fonts)
                                    :font-weight 300
                                    :font-size   (:title-font units) 
                                    :line-height (:title-line-height units)
                                    :cursor      :pointer})
    [v/hovered {:background (:night colors)}]]
   [:#mc_embed_signup [:div.mce_inline_error (merge (:subtitle templates)
                                                    {:width (percent 100)
                                                     :padding-left (str (float (:magnitude (:full units))) (name (:unit (:full units))) " !important")
                                                     :margin "0 !important"
                                                     :color (str (:day colors) " !important")
                                                     :background (str (:night colors) " !important")})]]

   [:#mce-success-response (merge (:title templates)
                                  {:padding-top (:full units)})]
   [:#mce-responses {:width (percent 100)}]
   [:#mce-error-response (merge (:subtitle templates)
                                {:width (percent 100)
                                 :padding (:third units)
                                 :padding-left (str (float (:magnitude (:full units))) (name (:unit (:full units))) " !important")
                                 :margin "0 !important"
                                 :color (str (:day colors) " !important")
                                 :background (str (:night colors) " !important")})]
   [:.feature--image {:width "100%"
                      :filter "grayscale(100%)"}]
   [:.example--image {:width "100%"
                      :filter "grayscale(100%)"
                      :transition [["all" "1s" "ease" "1s"]]}
    [v/hovered {:filter "none"}]]
   (at-media {:min-width (px 768)} 
             [:.sticky {:position :sticky
                        :padding [[(:full units) 0 (:full units) 0]]
                        :top (:full units)}])
   ;responsiveness working
   (let [{:keys [min-width max-width percent]} (first breakpoints)]
     (at-media {:min-width min-width :max-width max-width}
               [v/header--textbar (merge {:font-size (/ (:header-font units) 2)
                                          :line-height (/ (:header-line-height units) 2)})]
               [v/header--textbar-small (merge {:display :none})]
               [v/header--section (merge {:flex 0})
                 [v/last {:padding 0}]]
               [:.main {:flex-direction :column}]
               [:.dashboard {:width "100%"
                             :padding [[0 (:full units)]]}]
               [:.sheets {:padding (:full units)}]
               [:.layout {:height "unset"}]))])


