(ns offcourse.styles.typography
  (:refer-clojure :exclude [+ - * /])
  (:require [garden.stylesheet :refer [at-font-face]]
            [offcourse.styles.vocabulary :as v]))

(defn make-at-font-face [[font-name file-name]]
  (at-font-face {:font-family font-name
                 :font-weight 500
                 :src (str "url('/fonts/" file-name ".woff') " "format('woff')")}))

; (s/defclass t--nittynormal)
; (s/defclass t--nittybold)
; (s/defclass t--nittygrotesk)
; (s/defclass t--nittygroteskbold)

(defn typography [{:keys [templates fonts]}]
  [(map make-at-font-face (:raw         fonts))
   [v/t--title               (:title          templates)]
   [v/t--subtitle            (:subtitle       templates)]
   [v/t--text                (:text           templates)]
   [v/t--banner              (:banner         templates)]
   [v/t--logo                (:logo           templates)]
   [v/t--form                (:form           templates)]
   [v/t--list                (:list           templates)]
   [v/t--label               (:label          templates)]])