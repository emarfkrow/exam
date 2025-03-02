/**
 * 転生抑止先２グリッド定義
 */

let Tb5TenseiYokushiSaki2GridColumns = [];

$(function() {
    Tb5TenseiYokushiSaki2GridColumns = [
        Column.text('TENSEI_YOKUSHI_SAKI2_ID', Messages['Tb5TenseiYokushiSaki2Grid.tenseiYokushiSaki2Id'], 80, 'primaryKey numbering', null),
        Column.text('TENSEI_YOKUSHI_ID', Messages['Tb5TenseiYokushiSaki2Grid.tenseiYokushiId'], 80, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb5TenseiYokushiSaki2Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
