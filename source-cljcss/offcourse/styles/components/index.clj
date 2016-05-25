(ns offcourse.styles.components.index
  (:require [offcourse.styles.components
             [dashboard :refer [dashboard]]
             [cards :refer [cards]]
             [button :refer [button]]
             [label :refer [label-component]]
             [list :refer [list-component]]
             [sheet :refer [sheet]]
             [footer :refer [footer]]
             [header :refer [header]]]))

(defn components [config]
  (let [components [dashboard sheet button label-component list-component header cards footer]]
    (for [component components] (component config))))
