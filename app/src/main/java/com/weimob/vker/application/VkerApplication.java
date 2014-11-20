package com.weimob.vker.application;

import android.app.Application;

import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;

import org.androidannotations.annotations.EApplication;

/**
 * Created by wanghuan on 14/11/20.
 */
@EApplication
public class VkerApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        /**
         *  init Android-Universal-Image-Loader
         */
        initImageLoader();
    }

    /**
     * init Android-Universal-Image-Loader
     * @link https://github.com/nostra13/Android-Universal-Image-Loader
     *
     * -- ImageLoaderConfiguration --
     *
     * ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
     * .memoryCacheExtraOptions(480, 800) // default = device screen dimensions
     * .diskCacheExtraOptions(480, 800, null)
     * .taskExecutor(...)
     * .taskExecutorForCachedImages(...)
     * .threadPoolSize(3) // default
     * .threadPriority(Thread.NORM_PRIORITY - 2) // default
     * .tasksProcessingOrder(QueueProcessingType.FIFO) // default
     * .denyCacheImageMultipleSizesInMemory()
     * .memoryCache(new LruMemoryCache(2 * 1024 * 1024))
     * .memoryCacheSize(2 * 1024 * 1024)
     * .memoryCacheSizePercentage(13) // default
     * .diskCache(new UnlimitedDiscCache(cacheDir)) // default
     * .diskCacheSize(50 * 1024 * 1024)
     * .diskCacheFileCount(100)
     * .diskCacheFileNameGenerator(new HashCodeFileNameGenerator()) // default
     * .imageDownloader(new BaseImageDownloader(context)) // default
     * .imageDecoder(new BaseImageDecoder()) // default
     * .defaultDisplayImageOptions(DisplayImageOptions.createSimple()) // default
     * .writeDebugLogs()
     * .build();
     *
     * -- DisplayImageOptions --
     *
     * DisplayImageOptions options = new DisplayImageOptions.Builder()
     * .showImageOnLoading(R.drawable.ic_stub) // resource or drawable
     * .showImageForEmptyUri(R.drawable.ic_empty) // resource or drawable
     * .showImageOnFail(R.drawable.ic_error) // resource or drawable
     * .resetViewBeforeLoading(false)  // default
     * .delayBeforeLoading(1000)
     * .cacheInMemory(false) // default
     * .cacheOnDisk(false) // default
     * .preProcessor(...)
     * .postProcessor(...)
     * .extraForDownloader(...)
     * .considerExifParams(false) // default
     * .imageScaleType(ImageScaleType.IN_SAMPLE_POWER_OF_2) // default
     * .bitmapConfig(Bitmap.Config.ARGB_8888) // default
     * .decodingOptions(...)
     * .displayer(new SimpleBitmapDisplayer()) // default
     * .handler(new Handler()) // default
     * .build();
     *
     * -- Acceptable URIs examples --
     * "http://site.com/image.png" // from Web
     * "file:///mnt/sdcard/image.png" // from SD card
     * "file:///mnt/sdcard/video.mp4" // from SD card (video thumbnail)
     * "content://media/external/images/media/13" // from content provider
     * "content://media/external/video/media/13" // from content provider (video thumbnail)
     * "assets://image.png" // from assets
     *
     */
    private void initImageLoader(){
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(this)
                .threadPriority(Thread.NORM_PRIORITY - 2)
                .denyCacheImageMultipleSizesInMemory()
                .diskCacheFileNameGenerator(new Md5FileNameGenerator())
                .diskCacheSize(50 * 1024 * 1024) // 50M
                .tasksProcessingOrder(QueueProcessingType.LIFO)
                .build();
        ImageLoader.getInstance().init(configuration);
    }
}
