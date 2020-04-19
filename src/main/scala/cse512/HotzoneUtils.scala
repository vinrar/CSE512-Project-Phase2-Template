package cse512

object HotzoneUtils {

  def ST_Contains(rect: String, point: String): Boolean = {
    val point_xy = point.split(",")
    val point_x = point_xy(0).trim().toDouble
    val point_y = point_xy(1).trim().toDouble

    val rectangle_points = rect.split(",")
    val rect_x1 = rectangle_points(0).trim().toDouble
    val rect_y1 = rectangle_points(1).trim().toDouble
    val rect_x2 = rectangle_points(2).trim().toDouble
    val rect_y2 = rectangle_points(3).trim().toDouble

    var min_x: Double = 0
    var max_x: Double = 0
    var max_y: Double = 0
    var min_y: Double = 0


    if (rect_x1 < rect_x2) {
      min_x = rect_x1
      max_x = rect_x2
    }
    else {
      min_x = rect_x2
      max_x = rect_x1
    }
    if (rect_y1 < rect_y2) {
      min_y = rect_y1
      max_y = rect_y2
    }
    else {
      min_y = rect_y2
      max_y = rect_y1
    }

    if (point_x >= min_x && point_x <= max_x && point_y >= min_y && point_y <= max_y) {
      return true
    }
    else {
      return false
    }
  }
  // YOU NEED TO CHANGE THIS PART - changed
}
