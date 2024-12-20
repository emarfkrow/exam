/**
 * 機能マスタグリッド定義
 */

let MsyKinoGridColumns = [
    Column.text('KINO_NM', Messages['MsyKinoGrid.kinoNm'], 160, 'primaryKey', null),
    Column.text('KINO_MEI', Messages['MsyKinoGrid.kinoMei'], 300, '', null),
    Column.date('KAISHI_BI', Messages['MsyKinoGrid.kaishiBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.date('SHURYO_BI', Messages['MsyKinoGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.check('DELETE_F', Messages['MsyKinoGrid.deleteF'], 30, ''),
];
