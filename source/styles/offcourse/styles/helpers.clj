(ns offcourse.styles.helpers)

(defn helpers [{:keys [templates breakpoints colors units fonts]}]
  [[:.margin-helper {:margin-bottom (:full units)}]])