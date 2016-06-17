(ns offcourse.styles.typography
  (:refer-clojure :exclude [+ - * /])
  (:require [garden.stylesheet :refer [at-font-face]]
            [offcourse.styles.vocabulary :as v]))

(defn make-at-font-face [[font-name file-name]]
  (at-font-face {:font-family font-name
                 :font-weight 500
                 :src (str "url('/fonts/" file-name ".woff') " "format('woff')")}))

(defn typography [{:keys [templates fonts]}]
  [(map make-at-font-face (:raw fonts))
   [v/title (:title templates)]
   [v/subtitle (:subtitle templates)]])