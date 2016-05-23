(ns offcourse.styles.components.index
  (:require [offcourse.styles.components
             [cards :refer [cards]]
             [button :refer [button]]
             [sheet :refer [sheet]]
             [header :refer [header]]]))

(defn components [config]
  (let [components [sheet button header cards]]
    (for [component components] (component config))))
