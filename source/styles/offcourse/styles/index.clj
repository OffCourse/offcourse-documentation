(ns offcourse.styles.index
  (:require [garden.def :refer [defstyles]]
            [offcourse.styles
             [config :refer [config]]
             [global :refer [global]]
             [helpers :refer [helpers]]
             [layout :refer [layout]]
             [shame :refer [shame]]
             [typography :refer [typography]]]
            [offcourse.styles.components.index :refer [components]]))

(defstyles base
  (let [modules [global typography layout components shame helpers]]
    (for [module modules] (module config))))