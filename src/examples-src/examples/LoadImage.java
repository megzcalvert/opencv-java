/* Description and License
 * A Java library that wraps the functionality of the native image 
 * processing library OpenCV
 *
 * (c) Sigurdur Orn Adalgeirsson (siggi@alum.mit.edu)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 */
 
package examples;

import java.util.Arrays;

import processing.core.PApplet;
import sj.opencv.HighGui;
import sj.opencv.HighGui.ImageLoadColorMode;
import sj.opencv.IplImage;
import sj.opencv.OpenCV;
import sj.opencv.PUtils;

/**
 * @author siggi
 * @date Jul 29, 2010
 */
public class LoadImage extends PApplet{

	IplImage im;

	@Override
	public void setup(){

		im = HighGui.loadImage(PUtils.guessDataLocation(this, "media/apples.jpg"), ImageLoadColorMode.CV_LOAD_IMAGE_UNCHANGED);

		// Do size here so we can initialize to the size of the image
		size(im.getWidth(), im.getHeight());
	}

	@Override
	public void draw(){
		image( PUtils.getPImage(im), 0, 0 );
	}

}