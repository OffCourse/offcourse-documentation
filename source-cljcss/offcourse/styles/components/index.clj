(ns offcourse.styles.components.index
  (:require [offcourse.styles.components
             [dashboard :refer [dashboard]]
             [cards :refer [cards]]
             [button :refer [button]]
             [list :refer [list-component]]
             [sheet :refer [sheet]]
             [header :refer [header]]]))

(defn components [config]
  (let [components [dashboard sheet button list-component header cards]]
    (for [component components] (component config))))
