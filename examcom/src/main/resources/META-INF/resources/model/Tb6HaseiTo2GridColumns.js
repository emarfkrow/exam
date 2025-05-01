/**
 * 派生先２グリッド定義
 */

let Tb6HaseiTo2GridColumns = [];

$(function() {
    Tb6HaseiTo2GridColumns = [
        Column.text('HASEI_TO2_ID', Messages['Tb6HaseiTo2Grid.haseiTo2Id'], 90, 'primaryKey numbering', null),
        Column.text('HASEI_ID', Messages['Tb6HaseiTo2Grid.haseiId'], 90, 'notblank', null),
        Column.text('HASEI_INFO', Messages['Tb6HaseiTo2Grid.haseiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6HaseiTo2Grid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
